
def doSimpleHttp(){
		 def baseUrl = new URL('http://localhost:8080/job/multibranchpipeline/job/master/lastSuccessfulBuild/api/json/buildNumber')
		 String auth = "admin" + ":" + "f730b47332fd4368908c92e230afc82b";
		 
		 String authHeaderValue = "Basic " + new String(auth); 
		 
		 HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
		 connection.addRequestProperty("Accept", "application/json")
		 connection.addRequestProperty("Authorization", authHeaderValue);
		 connection.with {
		   doOutput = true
		   requestMethod = 'GET'
		   println connection.inputStream.text
		 }
}

return this

