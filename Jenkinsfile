pipeline { 
    agent any 
    tools{
        maven 'Default'
        jdk 'Default'
    }
        stages { 
            stage ('Clean') { 
                steps { 
                
                        bat 'mvn clean'
                    
                }
            }
       
            stage ('Test') { 
                steps { 
                
                        bat 'mvn test'
                    
                }
            }
        
            stage ('Build') { 
                steps { 
                
                        bat 'mvn install'
                    
                }
            }
            stage ('Sonar'){
                steps{
                    bat 'mvn sonar:sonar \
  -Dsonar.projectKey=first-sonar \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=c05272a8ccf9a4f897ce947e4bbfae686db4c360 '
                }
            }
        }
    }
