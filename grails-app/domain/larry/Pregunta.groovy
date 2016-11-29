package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Pregunta {
  int idUser
  int idCat

  String titulo
  String texto
  Date dateCreated
  static mapping= {
    texto type: "text"
    titulo type: "text"
  }

}
