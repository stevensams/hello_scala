class Hello {
	def classMethod(text: String) {
		println("\n" + text)
	}
}

object Hi { 
	def main(args: Array[String]) {
		print("Hi there!")
		val c = new Hello
		c.classMethod("Say hello!")
	} 
}
