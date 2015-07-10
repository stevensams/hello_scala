class Greeting {
	def hello(text: String) : String = "Hello " + text
	def goodbye(text: String) : String = "Goodbye " + text
}

object Hi { 
	def main(args: Array[String]) {
		// sbt 'run hello' 
		val output: String = if(args(0) == "hello") {
			hello
		} else {
			"Unknown argument: " + args(0)
		}
		println(output)
	}

	def hello() : String = {
		val names = List("John", "James", "Paul", "Roger")
		val c = new Greeting
		var response = ""
		/*for(name <- names) {
			response = response + c.hello(name) + "\n"
			response = response + c.goodbye(name) + "\n"
		}*/
		names.foreach(name => response = response + c.hello(name) + "\n" + c.goodbye(name) + "\n")
		response
	}

	/*

	def functionName(argumentName: argumentType) : returnType = {
		calculation
	}

	def functionName(argumentName: argumentType) : returnType = calculation

	*/
}