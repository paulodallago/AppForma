import React from 'react';
import {Text} from 'react-native';
import { Montserrat_500Medium } from '@expo-google-fonts/montserrat';
import {useFonts} from 'expo-font';
import Header from './Header';

const MyText = (props) => {
  let [fontsLoaded] = useFonts({
    montserrat: Montserrat_500Medium
  });
  if (!fontsLoaded) {
    return <Header/>;
  }
  return <Text style={[props.style, {fontFamily: "montserrat"}]}>{props.text}</Text>;
};

export default MyText;