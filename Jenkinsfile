pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('build') {
            steps {
                bat 'echo building project ...'
                bat "mvn clean package"
            }
        }
        stage('deploy') {
            steps {
                bat "copy target\mvn-jenkins-sample.war C:\xampp\tomcat\webapps"
            }
        }
    }
}