def call(Map config) {

     echo 'siteDeploy - STARTED'

    echo "${config.application}"

     echo "${config.application.name}"
    
     echo 'siteDeploy - Pipe started'
    
    pipeline {

        agent { label "${config.build.image}" }
       
       stages {
            stage('Build') { 

                steps {
                    script {
                    echo 'Building...'
                    }
                }
            }

            stage('Unit Test') {
                steps {
                    script {
                    echo 'Unit Testing...'
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                    echo 'Deploying...'
                      deployApplication(config)
                         echo 'Deploy finish'
                    }
                }
            }
       }

    }


}
