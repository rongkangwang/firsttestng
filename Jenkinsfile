pipeline {
    agent any
    stages {
        stage('Before') {
            steps {
                echo 'Starting sonar analysis...'
            }
        }
        stage('Build and Analyzing') {
            steps {
                withSonarQubeEnv("sonar") {
                    withMaven(maven:'m3') {
                        sh "mvn clean compile sonar:sonar -Dsonar.analysis.mode=preview"
                    }
                }
            }
        }
    }
}