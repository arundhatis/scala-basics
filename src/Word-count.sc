import org.apache.spark_

val input = sc.textFile("README.md")
val inputWords = input.flatMap(x=> x.split(" "))
val initWordCount = inputWords.map(word=>(word,1))
val wordCount= initWordCount.reduceByKey(_+_)
wordCount.collect()
