from django.db import models

# Create your models here.
class Persona(models.Model):
    nombres = models.CharField(max_length=50)
    ape_paterno = models.CharField(max_length=50)
    ape_materno = models.CharField(max_length=50)
    sexo = models.CharField(max_length=50)
    f_nacimiento = models.DateField()
    direccion = models.CharField(max_length=50)
    telefono = models.CharField(max_length=100)

    def __str__(self):
        return f'{self.nombres} {self.ape_paterno} {self.ape_materno}'  