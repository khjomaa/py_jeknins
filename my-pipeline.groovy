pipeline {
    agent any
    triggers {
        pollSCM '*/2 * * * *'
    }
    stages {
        stage('checkout') {
            steps {
                git "https://github.com/khjomaa/py_jeknins.git"
            }
        }
        stage("run something") {
            steps {
                sh 'python3 app.py'
            }
        }
    }
}