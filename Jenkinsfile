pipeline { 
    agent any
    tools{
        maven 'Default'
        jdk 'Default'
    }
     environment {                                      
        SERVER_ID = 'my-artifact'
        registry = "sulabhdocker09/docker-test"
         registryCredential = 'dockerhub'
    }

        stages { 
            stage ('Clean') { 
                steps { 
                
                        bat 'mvn clean'
                    
                }
            }
       
            // stage ('Test') { 
            //     steps { 
                
            //             bat 'mvn test'
                    
            //     }
            // }
        
            stage ('Build') { 
                steps { 
                
                        bat 'mvn install'
                    
                }
            }
            
//              stage('Building image') {
//       steps{
//         script {
//           docker.build registry 
//         //   + ":$BUILD_NUMBER"
//         }
//       }
//              }
//              stage('Deploy Image') {
//         steps{  
//             script {
//                 docker.withRegistry( '', registryCredential ) {
//                     //  dockerImage.push()
//                     bat 'docker push sulabhdocker09/docker-test'
//                      }
//                  }
//               }
//              }
//              stage('Run Docker container on Jenkins Agent') {
             
//             steps 
//   {
//               bat 'docker run -d -p 8003:8080 sulabhdocker09/docker-test'
 
//             }
//         }
        //      stage("Upload artifact") {
        //     steps {
        //         rtUpload (                             
        //             serverId: "$SERVER_ID",
        //             spec: '''{
        //                   "files": [
        //                     {
        //                       "pattern": "target/*.war",
        //                       "target": "libs-snapshot-local/"
        //                     }
        //                  ]
        //             }'''
        //         )
        //     }
        // }

        //     stage ('Sonar Analysis'){
        //          steps{
        //             bat 'mvn sonar:sonar \
        //              -Dsonar.projectKey=Sonar-calculator-code \
        //              -Dsonar.host.url=http://localhost:9000 \
        //              -Dsonar.login=a97a24e8cf9fad8e1282fb52e75539285b10722c'
                     
        //         }
        //     }
        stage('Docker Build and Tag') {
           steps {
              
                bat 'docker build -t docker-test1:latest .' 
                bat 'docker tag docker-test1 sulabhdocker09/docker-test1:latest'
                //sh 'docker tag samplewebapp nikhilnidhi/docker-test1:$BUILD_NUMBER'
               
          }
        }
     
  stage('Publish image to Docker Hub') {
          
            steps {
                script{
        docker.withRegistry( '', registryCredential ) {
          bat  'docker push sulabhdocker09/docker-test1:latest'
        //  sh  'docker push nikhilnidhi/samplewebapp:$BUILD_NUMBER' 
        }
                }
          }
        }
     
      stage('Run Docker container on Jenkins Agent') {
             
            steps 
   {
                sh "docker run -d -p 8003:8080 sulabhdocker09/docker-test1"
 
            }
        }
         }
             
//          post { 
//             always { 
//           junit 'target/surefire-reports/*.xml'   
        
//     }

// }

       
}
