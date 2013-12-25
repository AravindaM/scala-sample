import org.apache.http.client.config.RequestConfig
import org.apache.http.client.methods.{CloseableHttpResponse, HttpGet}
import org.apache.http.HttpHost
import org.apache.http.impl.client.{HttpClientBuilder, CloseableHttpClient}

/**
 *  Http client script.
 *
 * By: Alexey Matveev
 * Date: 11.12.13
 * Time: 11:49
 */
type response = (Array[String],Int)

require(args.size >= 1, "please specify url to connect")
val url: String = args(0)

formatResponse(executeRequest(url))

/**
 * Executes request for provided url.
 * @param url
 * @return headers array and status code
 */
def executeRequest(url: String): response = {
  val get = new HttpGet(url)
  val proxy: HttpHost = new HttpHost("proxy", 3128, "http")
  get.setConfig(RequestConfig.custom().setProxy(proxy).build())
  val client: CloseableHttpClient = HttpClientBuilder.create().build()
  val response: CloseableHttpResponse = client.execute(get)
  (response.getAllHeaders.map(_ toString),response.getStatusLine.getStatusCode)
}

/**
 * Provides the formatted response.
 * @param response
 */
def formatResponse (response: response) {
  println("StatusCode: " + response._2)
  println("Headers: ")
  response._1.foreach(h => println("* " + h))
}