# CALIFICACION_FINAL
El programa calcula el promedio final de estudiante e indica si aprueba la materia

INSTRUCCIONES
Desarrolle una interfaz gráfica que cumpla con las siguientes condiciones:

• Cuando el programa arranque debe mostrar los elementos JTextField y JLabel para ingresar dos notas
y el botón “Obtener nota”.

• Cuando el usuario presiona el botón “Obtener nota” se debe:

• Validar que los campos de notas estén llenos y que los valores estén entre 0.00 y 10.00, caso
contrario se debe mostrar un mensaje de error (JOptionPane).

• Si los campos están llenos correctamente debe aparecer el JLabel mostrando el resultado de la
suma de las dos notas ingresadas, se deben deshabilitar los dos campos de texto y debe aparecer
un botón “Reiniciar”.

• Si el resultado de la suma es mayor o igual que 14.00:

  • Debe aparecer otro JLabel que contendrá el valor de la suma multiplicado por 2.
  
  • Mostrar un JLabel con el mensaje “Exonerado”.
  
• Si el resultado de la suma es menor que 14.00:

  • Deben aparecer los elementos para ingresar la nota de supletorio un JLabel, un JTextField y un
    JButton (“Obtener nota final”).
    
  • Al presionar el botón “Obtener nota final” se debe:
  
    • Validar que el campo de texto contenga la nota de supletorio y que esté entre 0.00 y
     20.00, caso contrario debe mostrar un mensaje de error (JOptionPane).
     
    • Si el campo de supletorio está lleno correctamente, el programa debe deshabilitar el
      campo de texto y mostrar un JLabel que contenga la nota final, en este caso será la suma
      de los valores de nota 1, nota 2 y supletorio.
      
    • Si el resultado de la nota final es mayor o igual que 24.00 debe mostrar un mensaje
      “Aprobado”.
      
    • Si el resultado de la nota final de menor que 24.00 debe mostrar un mensaje
      “Reprobado”
      
• Para volver a ingresar las notas, el usuario debe hacer clic en el botón “Reiniciar” que debe volver la
pantalla a su estado inicial, es decir, volver a habilitar todos los campos y borrar los valores y ocultar
los campos correspondientes
