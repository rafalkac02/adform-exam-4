import com.sun.tools.javac.util.Assert

import java.util.regex.Pattern

class Calendar {

  // name, day, start-time, end-time
  val storage = Seq.empty[(String, String, String, String)]

  // store dates
  // add task to a range of time

  // version without overlapping dates


  // date format: DD-MM-YYYY
  val dateFormat: Pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}")



  def addTask(name: String, startDate: String, startTime: String, duration: Int) = {


    if (matcher.find)
    else println("Error. Invalid date")

  }
}
1