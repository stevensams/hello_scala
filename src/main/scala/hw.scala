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
		val hi: String = "Hi there "
		val names = List("John", "James", "Paul", "Roger")
		val c = new Greeting
		for(name <- names) {
			var response = c.hello(name)
			println(response)
			response = c.goodbye(name)
			println(response)
		}
	}
}