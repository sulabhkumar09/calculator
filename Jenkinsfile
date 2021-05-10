pipeline { 
    
    agent any
    
    // tools{
        
    //          maven 'Default'
    //          jdk 'Default'
    //      }
    
     environment {                                      

                     SERVER_ID = 'my-artifact'
                     registry = "sulabhdocker09/docker-test"
                     registryCredential = 'dockerhub'
                }

        stages { 
        //     stage ('Clean') { 
        //         steps { 
                
        //                 bat 'mvn clean'
                    
        //                     }
        //             }
       
        //     stage ('Test') { 
        //         steps { 
                
        //                 bat 'mvn test'
                    
        //               }
        //          }
        
        //     stage ('Build') { 
        //         steps { 
                
        //                 bat 'mvn install'
                    
        //              }
        //             }
            
        // stage("Upload artifact") {
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
        
        //  stage ('Sonar Analysis'){
        //          steps{
        //             bat 'mvn sonar:sonar \
        //             -Dsonar.projectKey=Sonar-calculator-code \
        //              -Dsonar.host.url=http://localhost:9000 \
        //              -Dsonar.login=df7a3dcbe740e1b42098aa7f3e0d860ba0676b18'
                     
        //         }
        //     }
            

       
    //     stage('Docker Build and Tag') {
    //       steps {
              
    //             bat 'docker build -t docker-test1:latest .' 
    //             bat 'docker tag docker-test1 sulabhdocker09/docker-test1:latest'
                
               
    //       }
    //     }
     
    //  stage('Publish image to Docker Hub') {
          
    //         steps {
    //             script{
    //     docker.withRegistry( '', registryCredential ) {
    //       bat  'docker push sulabhdocker09/docker-test1:latest'
       
    //              }
    //         }
    //       }
    //     }
        
        stage('Stop Running Container'){
            steps{
                script{
                    name = bat' docker ps -qf "ancestor=docker-test1" '
                    port = bat ' docker ps -qf "expose=8080/tcp" '
                    if(!( name && port )){
                        
                          bat "docker run -d -p 8003:8080 sulabhdocker09/docker-test1"
                     
                    }
                }
            }
        }
     
      stage('Run Docker container') {
             
            steps 
                 {
                     C_id= bat 'docker ps -qf "ancestor=docker-test1:latest"'
                      bat 'docker stop +'$C_id' '
 
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
        

         }
             
//          post { 
//             always { 
//           junit 'target/surefire-reports/*.xml'   
        
//     }

// }

       
}