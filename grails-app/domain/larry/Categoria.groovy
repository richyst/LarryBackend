package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Categoria {
  static hasMany = [preguntas: Pregunta]
  String nombre
  String imagen
}
