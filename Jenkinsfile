pipeline {
    agent any
    parameters {
        choice(name: 'ENVIRONMENT', choices: ['Dev', 'QA', 'UAT', 'Prod'], description: 'Select the environment for deployment')
    }
    stages {
        stage('Deploy to Selected Environment') {
            steps {
                script {
                    def server = ''
                    if (params.ENVIRONMENT == 'Dev') {
                        server = 'user@dev-server:/var/www/html/'
                    } else if (params.ENVIRONMENT == 'QA') {
                        server = 'user@qa-server:/var/www/html/'
                    } else if (params.ENVIRONMENT == 'UAT') {
                        server = 'user@uat-server:/var/www/html/'
                    } else if (params.ENVIRONMENT == 'Prod') {
                        server = 'user@prod-server:/var/www/html/'
                    }
                    
                    // Deploying to the selected environment
                    sh """
                    scp target/myapp.war ${server}
                    ssh ${server.split(':')[0]} "sudo systemctl restart tomcat"
                    """
                }
            }
        }
    }
}
