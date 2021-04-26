pipeline { 
    agent any 
    tools{
        maven 'Default'
        jdk 'Default'
    }
     environment {                                      
        SERVER_ID = 'my-artifact'
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
             stage("Upload artifact") {
            steps {
                rtUpload (                             
                    serverId: "$SERVER_ID",
                    spec: '''{
                          "files": [
                            {
                              "pattern": "target/*.war",
                              "target": "libs-snapshot-local/"
                            }
                         ]
                    }'''
                )
            }
        }

            stage ('Sonar Analysis'){
                 steps{
                    bat 'mvn sonar:sonar \
                    -Dsonar.projectKey=first-sonar \
                     -Dsonar.host.url=http://localhost:9000 \
                     -Dsonar.login=c05272a8ccf9a4f897ce947e4bbfae686db4c360 '
                }
            }
        }
         post { 
            always { 
          junit 'target/surefire-reports/*.xml'   
        
    }

}

       
}
