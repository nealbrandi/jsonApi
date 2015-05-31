
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    """),format.raw/*5.5*/("""<div class="well">
        <h1>"""),_display_(/*6.14*/message),format.raw/*6.21*/("""</h1>
    </div>

""")))}),format.raw/*9.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 18:51:06 EDT 2015
                  SOURCE: /Users/nealbrandi/code/jsonApi/app/views/index.scala.html
                  HASH: 2ad28940a40bf603affb0d9bc1845248c268e494
                  MATRIX: 505->1|610->18|638->21|679->54|718->56|750->62|808->94|835->101|883->120
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|27->6|27->6|30->9
                  -- GENERATED --
              */
          