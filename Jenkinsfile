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
                bat "cp target/mvn-jenkins-sample.war C:/xampp/tomcat/webapp"
            }
        }
    }
}