package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Respuesta {
  String texto
  int score
  boolean res
  String username
  int idPreg
  static mapping= {
    texto type: "text"
  }
}
