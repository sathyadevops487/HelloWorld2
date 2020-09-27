import jenkins.model.*

def doGetAllJenkinsDetails(jobname){
	def jenkins = Jenkins.instance.getItem(jobname)
	
	println "Job type: ${jenkins.getClass()}"	
	println "Last successfull build: ${jenkins.getLastSuccessfulBuild()}"
	println "Last failed build: ${jenkins.getLastFailedBuild()}"
	println "Last build: ${jenkins.getLastBuild()}"
	println "All builds: ${jenkins.getBuilds().collect{ it.getNumber()}}"
}

return this