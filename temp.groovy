import jenkins.model.*
import jenkins.*


def doGetAllJenkinsDetails(jobname){
	def lastSuccessfulPipelineID = Jenkins.instance.getItem("multibranchpipeline").lastSuccessfulBuild
	
	println(lastSuccessfulPipelineID)
}

return this