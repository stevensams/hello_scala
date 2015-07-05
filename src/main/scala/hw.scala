class Hello {
	def classMethod(text: String) : String = {
		return text
	}
}

object Hi { 
	def main(args: Array[String]) {
		var hi: String = "Hi there "
		val names = List("John", "James", "Paul", "Roger")
		val c = new Hello
		for(name <- names) {
			val response = c.classMethod("Say hello: " + name)
			println(response)
		}
	}
}
