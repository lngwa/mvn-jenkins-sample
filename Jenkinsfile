pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('build') {
            steps {
                sh 'echo building project ...'
            }
        }
        stage('deploy') {
            steps {
                sh "echo deployed!"
            }
        }
    }
}