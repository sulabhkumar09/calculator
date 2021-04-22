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
        }
    }
