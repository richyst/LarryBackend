package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Categoria {
  String nombre
  String imagen
  static mapping = {
   imagen type: 'text'
 }
}
