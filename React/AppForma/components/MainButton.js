import React from 'react';
import {View, StyleSheet, TouchableOpacity, Text} from 'react-native';
import {vh, vw, bgColor, lgBlue, dkBlue} from './Constants';
import MyText from './MyText';

const styles = StyleSheet.create({
  boxBtnMain: {
    marginBottom: vh*1,
    width: vw*80,
    marginHorizontal: 'auto',
    alignSelf: 'center',
  },
  btnMain: {
    alignItems: 'center',
    borderWidth: 2,
    borderColor: lgBlue,
    borderRadius: vw*4,
    paddingVertical: vh*2,
  },
  btnMainText: {
    fontSize: 20,
  }
})

const MainButton = props => {
  return (
    <View style={styles.boxBtnMain}>
      <TouchableOpacity style={styles.btnMain} onPress={props.btnMainPress}><MyText style={styles.btnMainText} text={props.btnNome}/></TouchableOpacity>
    </View>
  );
}

export default MainButton;