def call(Map config) {


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
                    }
                }
            }
       }

    }


}