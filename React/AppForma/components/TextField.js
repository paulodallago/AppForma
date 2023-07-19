import React from 'react';
import {View, Text, TextInput, StyleSheet} from 'react-native';
import {vh, vw, bgColor} from './Constants';
import MyText from './MyText';

const styles = StyleSheet.create({
  textInput: {
    borderWidth: 1,
    borderRadius: vh*2,
    borderColor: '#aaaaaa',
    height: vh*5,
    marginBottom: 10,
    paddingHorizontal: 10,
  },
  label: {
    marginStart: vw*3,
    fontSize: 20,
  }
})

const TextField = props =>  {
  return (
    <View>
      <MyText style={styles.label} text={props.text}/>
      <TextInput style={styles.textInput} onChangeText={props.onChangeText} keyboardType={props.keyboard}></TextInput>
    </View>
  );
}

export default TextField;