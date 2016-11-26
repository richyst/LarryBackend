package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Pregunta {
  static hasMany = [respuestas:Respuesta]
  String titulo
  String texto
  String status
  
}
