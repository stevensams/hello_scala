class Greeting {
	def hello(text: String) : String = {
		return "Hello " + text
	}
	def goodbye(text: String) : String = {
		return "Goodbye " + text
	}
}

object Hi { 
	def main(args: Array[String]) {
		// sbt 'run hello' 
		var output = ""
		if(args(0) == "hello") {
			output = hello()
		}
		print(output)
	}

	def hello() : String = {
		val names = List("John", "James", "Paul", "Roger")
		val c = new Greeting
		var response = ""
		for(name <- names) {
			response = response + c.hello(name) + "\n"
			response = response + c.goodbye(name) + "\n"
		}
		return response
	}

	/*
	def functionName(argumentName: argumentType): ReturnType = {
	}
	*/
}