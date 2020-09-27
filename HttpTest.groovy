import java.net.URL
def testHttpMethod(){
	def baseUrl = new URL('http://ergast.com/api/f1/2004/1/results.json')
	
	HttpURLConnection connection = (HttpURLConnection)baseUrl.OpenConnection();
	connection.addRequestProperty("Accept", "application/json")
	connection.with{
		doOutput = true
		requestMethod = 'GET'
		println connection.inputstream.text
	}
	
}