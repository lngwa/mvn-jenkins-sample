pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('build') {
            steps {
                sh 'echo building project ...'
                sh "mvn clean package"
            }
        }
        stage('deploy') {
            steps {
                sh "cp target/mvn-jenkins-sample.war C:/xampp/tomcat/webapp"
            }
        }
    }
}