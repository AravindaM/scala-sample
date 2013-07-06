package learn.html

import scala.xml.Source
import org.htmlcleaner.{TagNode, HtmlCleaner}
import java.net.{ConnectException, MalformedURLException, URL}
import scala.io._;
import java.io.{File, PrintWriter, IOException}

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 20:49
 */
object HtmlParser {

  val htmlCleaner = new HtmlCleaner

  val output : PrintWriter = new PrintWriter(new File("C:\\dev\\workspace\\scala-sample\\result.txt"), "UTF-8")

  def processElements(node: TagNode) = {
    val elements = node.getElementsByName("a", true)
    for (elem <- elements) {
      val nextLink = elem.getAttributeByName("href")

    }
  }

  def main(args: Array[String]) {
    val source = Source.fromString("<html><body><h1>Hello Scala!</h1></body></html>");
    val google_url = "http://google.com"
    val local_url = "http://localhost:8000/jquery.html"

//    val rootNode: TagNode = htmlCleaner.clean(proxy(google_url))
    lookInside(google_url, 2)
    output.close();
  }

  def lookInside(url: String, deepth : Int) : Unit = {
//    val site = new SiteRefs(url)
    if (deepth < 0) {}
    else {
      val rootNode = try {
        htmlCleaner.clean(proxy(url))
      } catch {
        case ce : ConnectException => {
          output.println("cannot connect to: "+url)
          null
        }
        case ioex : IOException => {
          output.println("IOException: "+url)
          null
        }
      }
      if (rootNode != null) {
        val elements = rootNode.getElementsByName("a", true)
        for (elem <- elements) {
          val nextLink = elem.getAttributeByName("href")
          val linkUrl = try {
            new URL(nextLink)
          } catch {
            case mue : MalformedURLException => {
              output.println("bad url: "+nextLink)
              null
            }
          }
          if (linkUrl != null) {
            output.println("  "*deepth + "dep="+deepth+" parent: "+url+" -> link: "+nextLink);
            lookInside(nextLink, deepth-1)
          }
        }
      }
    }

  }

  def proxy(url : String) : URL = {
    System.setProperty("http.proxyHost", "10.233.104.141");
    System.setProperty("http.proxyPort", "3128");
//    System.setProperty("http.proxyUser", "matveev");
//    System.setProperty("http.proxyPassword", "KTdlio8C");
    new URL(url)
  }
}
