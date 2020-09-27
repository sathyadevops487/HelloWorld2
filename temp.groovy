import jenkins.model.*
import jenkins.*


def doGetAllJenkinsDetails(jobname){
	def lastSuccessfulPipelineID = Jenkins.instance.getItem(jobname).lastSuccessfulBuild.displayName
	def pa = new ParametersAction([
		new StringParameterValue("lastSuccessfulPipelineID", lastSuccessfulPipelineID)
	])
	println(lastSuccessfulPipelineID)
}

return this