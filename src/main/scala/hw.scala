class Hello {
	def classMethod(text: String) : String = {
		return "\n" + text
	}
}

object Hi { 
	def main(args: Array[String]) {
		var hi: String = "Hi there "
		val names = List("John", "James", "Paul")
		val c = new Hello
		for(name <- names) {
			val  response = c.classMethod("Say hello " + name)
			println(response)
		}
	}
}
