
def doSimpleHttp(){
		 def baseUrl = new URL('http://localhost:8080/job/multibranchpipeline/job/master/lastSuccessfulBuild/api/json/buildNumber')
		 HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
		 connection.addRequestProperty("Accept", "application/json")
		 connection.with {
		   doOutput = true
		   requestMethod = 'GET'
		   println content.text
		 }
}

return this

