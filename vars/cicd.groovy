def newDownload(repo)
{
  git "https://github.com/ashaykumbhare/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(ip,path)
{
  deploy adapters: [tomcat9(credentialsId: '80e1d619-bdae-49ae-b6c8-dcb12c9b296a', path: '', url: "http://${ip}:8080")], contextPath: "${path}", war: '**/*.war'
}
def newTest(testpipeline)
{
  sh "java -jar /var/lib/jenkins/workspace/$(testpipeline}/testing.jar"
}
