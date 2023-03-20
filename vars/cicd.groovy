def newDownload(repo)
{
  git "https://github.com/ashaykumbhare/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
