trait Hello {
	val hi: String
}

trait Goodbye {
	val bye: String
}

class Greeting(hello: String, goodbye: String) extends Hello with Goodbye {
	val hi = hello
	val bye = goodbye
	def hello(text: String) : String = hi + text
	def goodbye(text: String) : String = bye + text
}

object Hw {
	def main(args: Array[String]) {
		// sbt 'run hello' 
		val output: String = if(args(0) == "hello") {
			Yo()
		} else {
			"Unknown argument: " + args(0)
		}
		println(output)
	}
}

object Yo {
	def apply() : String = {
		val names = List("John", "James", "Paul", "Roger")
		val c = new Greeting("Hello ", "Goodbye ")
		var response = ""
		/*for(name <- names) {
			response = response + c.hello(name) + "\n"
			response = response + c.goodbye(name) + "\n"
		}*/
		names.foreach(name => response = response + c.hello(name) + "\n" + c.goodbye(name) + "\n")
		response
	}
}
	/*

	def functionName(argumentName: argumentType) : returnType = {
		calculation
	}

	def functionName(argumentName: argumentType) : returnType = calculation

	*/
