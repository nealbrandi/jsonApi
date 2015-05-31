
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png")),format.raw/*7.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.at("javascripts/bootstrap.min.css")),format.raw/*8.84*/("""'>
    <script type='text/javascript' src='"""),_display_(/*9.42*/routes/*9.48*/.Assets.at("stylesheets/jquery.min.js")),format.raw/*9.87*/("""'></script>

    <style>
    body """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
        """),format.raw/*13.9*/("""margin-top: 50px;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(/*21.59*/title),format.raw/*21.64*/("""</a>
            </div>
        </div>
    </div>
    <div class="container">
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""
    """),format.raw/*27.5*/("""</div>
</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 18:51:06 EDT 2015
                  SOURCE: /Users/nealbrandi/code/jsonApi/app/views/main.scala.html
                  HASH: 43f6954f6147abbe176250ec3810f1263585796c
                  MATRIX: 509->1|627->31|655->33|723->75|748->80|837->143|851->149|903->181|966->218|980->224|1043->267|1113->311|1127->317|1186->356|1248->390|1277->391|1313->400|1362->422|1390->423|1422->428|1650->629|1676->634|1790->721|1818->728|1850->733
                  LINES: 19->1|22->1|24->3|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|33->12|33->12|34->13|35->14|35->14|36->15|42->21|42->21|47->26|47->26|48->27
                  -- GENERATED --
              */
          