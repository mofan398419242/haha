package com.haha.web

import scala.xml.Elem

/**
 * Created by famo on 8/5/15.
 */
trait Page {
  def getPage: Elem
}

object Index extends Page {
  override def getPage: Elem =
    <html>
      <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8"></meta>
        <meta name="viewport" content="width=device-width, initial-scale=1"></meta>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"></link>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/index.css"></link>
      </head>
      <body>
        <div class="navbar-wrapper">
          <div class="container">
            <nav class="navbar navbar-inverse navbar-static-top">
              <div class="container">
                <div class="navbar-header">
                  <a class="navbar-brand" href="#">Brand</a>
                </div>
                <div class="navbar-collapse collapse">
                  <ul class="nav navbar-nav">
                    <li class="active">
                      <a href="#">Home</a>
                    </li>
                    <li>
                      <a href="#">Link</a>
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
          </div>
        </div>
        <div>
          <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
              <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
              <li data-target="#myCarousel" data-slide-to="1"></li>
              <li data-target="#myCarousel" data-slide-to="2"></li>
              <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
              <div class="item active">
                <div>haha1</div>
              </div>

              <div class="item">
                <div>haha2</div>
              </div>

              <div class="item">
                <div>haha3</div>
              </div>

              <div class="item">
                <div>haha4</div>
              </div>
            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
              <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
              <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>

        <!-- header split -->
        <div class="container marketing">
          <div class="row">
            <div class="col-lg-4">
              <img class="img-circle" src="img/fork.jpg" width="140" height="140"></img>
              <h2>吃吃吃</h2>
              <p>逛吃逛吃逛吃</p>
              <p>
                <a class="btn btn-default" href="#" role="button">View Detail >></a>
              </p>
            </div>
          </div>
        </div>

      </body>
    </html>


}
