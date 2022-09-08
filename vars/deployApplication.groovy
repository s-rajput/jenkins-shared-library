 def call(Map config) {

    echo 'DeployApplication - STARTED'

    echo "${config.name}"

    sh 'env > env.txt'

    for (String i : readFile('env.txt').split("\r?\n")) {
        echo i
    }
     
}