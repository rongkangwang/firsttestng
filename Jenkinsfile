pipeline {
    agent {
        docker {
            image 'maven:3.5.0-jdk-8-alpine'
            label 'dockerserver'
        }
    }
    stages {
        stage('Before') {
            steps {
                echo 'Starting sonar analysis...'
            }
        }
        stage('Build and Analyzing') {
            steps {
                withSonarQubeEnv("Local SonarQube Server") {
                    sh "mvn clean compile sonar:sonar"
                }
            }
        }
    }
}