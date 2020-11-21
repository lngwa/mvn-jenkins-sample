pipeline {
    agent any
    tools {
        maven 'maven_3.5.2'
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