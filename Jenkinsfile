pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                withMaven(maven: 'maven_4_0_0'){
                    sh "mvn clean package"
                }
            }

        }
        stage("deploy") {
            steps {
                sh "cp target/mvn-jenkins-sample.war C:/xampp/tomcat/webapp"
            }
        }
    }
}