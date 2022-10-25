from rest_framework import serializers

from .models import Persona

class PersonaSerializer(serializers.ModelSerializer):
    class Meta:
        model = Persona
        fields = ['id', 'nombres', 'ape_paterno', 'ape_materno', 'sexo', 'f_nacimiento', 'direccion', 'telefono']
        # fields = '__all__'