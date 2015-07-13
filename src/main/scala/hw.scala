package sams.steven.hw

trait Hello {
	val hi: String
}

trait Goodbye {
	val bye: String
}

class Greeting(hello: String, goodbye: String) extends Hello with Goodbye {
	val hi = hello
	val bye = goodbye
	// method
	def hello(text: String) : String = hi + text
	def goodbye(text: String) : String = bye + text
}

object Hw {
	def main(args: Array[String]) {
		// sbt 'run hello' 
		val output: String = if(args(0) == "hello") {
			Yo()
		} else if(args(0) == "match") {
			Match("two")
		} else {
			"Unknown argument: " + args(0)
		}
		println(output)
	}
}

object Match extends (String => String) {
	def apply (test: String) : String = {
		var result: String = test match {
  			case i if i == "one" => "1"
  			case i if i == "two" => "2"
  			case _ => "0"
		}
		result
	}
}

object Yo {
	// function
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

	Methods in classes are methods. Methods defined standalone in the repl are Function* instances.

	def functionName(argumentName: argumentType) : returnType = {
		calculation
	}

	def functionName(argumentName: argumentType) : returnType = calculation

	*/
