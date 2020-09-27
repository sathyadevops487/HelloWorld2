import jenkins.model.*
import jenkins.*


def doGetAllJenkinsDetails(jobname){
	def list = ["Kay","Henry","Justin","Tom"]
	def lastSuccessfulPipelineID = Jenkins.instance.getItem("multibranchpipeline").lastSuccessfulBuild.displayName
	for (int f = 0; f < list.size(); f++){
		echo "${list[f]}"
	}
	println(lastSuccessfulPipelineID)
}

return this