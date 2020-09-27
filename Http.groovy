
def doSimpleHttp(){
		 def baseUrl = new URL('http://localhost:8080/job/multibranchpipeline/job/master/lastSuccessfulBuild/api/json/buildNumber')
		 
		 
		 String authHeaderValue = "Basic " + new String(auth); 
		 BASE64Encoder enc = new sun.misc.BASE64Encoder();
		 String auth = "admin" + ":" + "f730b47332fd4368908c92e230afc82b";
		 String encodedAuthorization = enc.encode( auth.getBytes() );
		 
		 HttpURLConnection connection = (HttpURLConnection) baseUrl.openConnection();
		 connection.addRequestProperty("Accept", "application/json");
		 connection.setRequestProperty("Authorization", "Basic "+
			 encodedAuthorization);
		 
		 connection.with {
		   doOutput = true
		   requestMethod = 'GET'
		   println connection.inputStream.text
		 }
}

return this

